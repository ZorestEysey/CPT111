public class CuckooClock extends Clock {

    public CuckooClock(int h, int m) {
        super(h,m);
    }
    
    @Override
    public void tick() {
        super.tick();
        if (getMinutes()==0){
            for (int i=0; i<getHours(); i++){
                System.out.println("Cuckoo!");
            }
        }
    }

    public static void main(String[] args) {
        CuckooClock cc1 = new CuckooClock(0, 58);
        cc1.tick();
        cc1.tick();  // Cuckoo!  
        System.out.println(cc1);  // 01:00  
        CuckooClock cc2 = new CuckooClock(13, 59);
        cc2.tick();  // Cuckoo!   
        // Cuckoo!

    }
}
