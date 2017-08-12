public class Twofer {
    public String twofer(String name) {
    	if (name == null ) name = "you"; 
        // String result = "One for " + name +", one for me.";
        // return result;
        return String.format("One for %s, one for me.", name);
    }
}