public class Main {

    public static void main(String[] args){

     Logger logger = Logger.getInstance();
    // logger.log("Hola mundo!");
     Logger logger_1= Logger.getInstance();

     logger.setValue("Mensaje");
     System.out.println(logger_1.getValue());

    }
}
