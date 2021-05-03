public class Singleton {

    private  static Singleton log;
    private  String value;
    private Singleton(){

    }

    public static Singleton getInstance(){

        if (log == null){
            log = new Singleton();
        }
        return log;
    }

    public void log(String msg){
        System.out.println(msg);
    }

    public void setValue(String msg) {
        value = msg;
    }

    public String getValue() {
        return  value;
    }


}
