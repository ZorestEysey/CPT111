import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.Group;
import javafx.stage.Stage;

public class ResizableFace extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. 创建一个 Group 用于放置面部所有形状（以脸中心为基准 (0,0)）
        Group faceGroup = new Group();

        // 脸：半径为 100 的圆，中心在 (0,0)
        Circle face = new Circle(0, 0, 100);
        face.setFill(Color.LIGHTYELLOW);
        face.setStroke(Color.BLACK);
        face.setStrokeWidth(2);

        // 左眼：中心 (-40, -30)，半径 15
        Circle leftEye = new Circle(-40, -30, 15);
        leftEye.setFill(Color.WHITE);
        leftEye.setStroke(Color.BLACK);
        leftEye.setStrokeWidth(1.5);
        // 瞳孔 (小黑点)
        Circle leftPupil = new Circle(-40, -30, 5);
        leftPupil.setFill(Color.BLACK);

        // 右眼：中心 (40, -30)，半径 15
        Circle rightEye = new Circle(40, -30, 15);
        rightEye.setFill(Color.WHITE);
        rightEye.setStroke(Color.BLACK);
        rightEye.setStrokeWidth(1.5);
        Circle rightPupil = new Circle(40, -30, 5);
        rightPupil.setFill(Color.BLACK);

        // 嘴：水平线，从 (-30, 30) 到 (30, 30)
        Line mouth = new Line(-30, 30, 30, 30);
        mouth.setStroke(Color.BLACK);
        mouth.setStrokeWidth(3);
        mouth.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);

        // 将所有部分添加到 Group
        faceGroup.getChildren().addAll(face, leftEye, leftPupil, rightEye, rightPupil, mouth);

        // 2. 将 Group 放入 StackPane，使其自动居中
        StackPane root = new StackPane(faceGroup);
        root.setStyle("-fx-background-color: lightblue;"); // 可选背景色，便于观察缩放

        Scene scene = new Scene(root, 500, 500);

        // 3. 添加窗口尺寸监听器，动态计算缩放因子
        // 初始参考半径 = 100，期望半径 = min(宽, 高) * 0.4 → 缩放因子 = 期望半径 / 100
        scene.widthProperty().addListener((obs, oldVal, newVal) -> resizeFace(scene, faceGroup));
        scene.heightProperty().addListener((obs, oldVal, newVal) -> resizeFace(scene, faceGroup));

        primaryStage.setTitle("Resizable Face");
        primaryStage.setScene(scene);
        primaryStage.show();

        // 立即应用一次初始缩放
        resizeFace(scene, faceGroup);
    }

    private void resizeFace(Scene scene, Group faceGroup) {
        double width = scene.getWidth();
        double height = scene.getHeight();
        if (width <= 0 || height <= 0) return;

        double desiredRadius = Math.min(width, height) * 0.4;   // 脸半径约为窗口较小边的 40%
        double referenceRadius = 100.0;                        // 绘制时使用的原始半径
        double scale = desiredRadius / referenceRadius;

        faceGroup.setScaleX(scale);
        faceGroup.setScaleY(scale);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
