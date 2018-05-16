package pages;

public class setup {

    public String getParameter(String name){

        String value = System.getProperty(name);

        if(value == null){
            throw new RuntimeException(name + " is not a good parameter");
        }
        if(value.isEmpty()){
            throw new RuntimeException(name + " is not a good parameter");
        }
        return value;
    }
}
