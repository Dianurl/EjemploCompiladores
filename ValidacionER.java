public class ValidacionER {
    public boolean validarNumber(String line) {
        if(line == null || line.length() < 4)
            return false;
        
        return line.matches("^[0-9]{8}$");
    }
    
    public boolean validarEmail(String line) {
        if(line == null)
            return false;
        
        return line.matches("^[A-Za-z0-9+_-]+[@][gmail|hotmail|outlook|yahoo|icloud|A-Za-z0-9-]+[.][A-Za-z0-9.-]+$");
    }
}