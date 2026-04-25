import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.beans.binding.Bindings;

public class polygon extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane to hold the circle and polygon  
        Pane pane = new Pane();

        // Create the circle and set its properties  
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.radiusProperty().bind(Bindings.min(pane.widthProperty(), pane.heightProperty()).divide(2).multiply(0.8));
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.TRANSPARENT);
        circle.setStrokeWidth(2);
        pane.getChildren().add(circle); // Add circle to the pane  

        // Create a quadrilateral (4-sided polygon) and set its properties
        Polygon quadrilateral = new Polygon();
        quadrilateral.setStroke(Color.BLACK);
        quadrilateral.setFill(Color.TRANSPARENT);
        quadrilateral.setStrokeWidth(2);
        pane.getChildren().add(quadrilateral); // Add polygon to the pane  

        // Update polygon points when circle size changes
        circle.radiusProperty().addListener((obs, oldVal, newVal) -> {
            updateRandomInscribedQuadrilateral(quadrilateral, circle);
        });

        // Also update polygon points when circle center changes
        circle.centerXProperty().addListener((obs, oldVal, newVal) -> {
            updateRandomInscribedQuadrilateral(quadrilateral, circle);
        });
        circle.centerYProperty().addListener((obs, oldVal, newVal) -> {
            updateRandomInscribedQuadrilateral(quadrilateral, circle);
        });

        // Initial update of polygon points
        updateRandomInscribedQuadrilateral(quadrilateral, circle);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Random Quadrilateral in Circle"); // Set the stage title  
        primaryStage.setScene(scene); // Place the scene in the stage  
        primaryStage.show(); // Display the stage  
    }

    // Method to update polygon points to create a random inscribed quadrilateral
    private void updateRandomInscribedQuadrilateral(Polygon quadrilateral, Circle circle) {
        double centerX = circle.getCenterX();
        double centerY = circle.getCenterY();
        double radius = circle.getRadius();

        // Clear existing points
        quadrilateral.getPoints().clear();

        // Generate 4 random angles for the quadrilateral vertices (sorted to avoid crossing lines)
        double[] angles = new double[4];
        angles[0] = Math.random() * Math.PI / 2; // 0 to 90 degrees
        angles[1] = Math.PI / 2 + Math.random() * Math.PI / 2; // 90 to 180 degrees
        angles[2] = Math.PI + Math.random() * Math.PI / 2; // 180 to 270 degrees
        angles[3] = 3 * Math.PI / 2 + Math.random() * Math.PI / 2; // 270 to 360 degrees

        // Sort angles to ensure convex quadrilateral (no crossing lines)        // Angles are already sorted by quadrant, so no need to sort    // Calculate and add points for each vertex
        for (int i = 0; i < 4; i++) {
            double x = centerX + radius * Math.cos(angles[i]);
            double y = centerY + radius * Math.sin(angles[i]);

            quadrilateral.getPoints().addAll(x, y);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
