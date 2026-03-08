package Models;

public class EstadisticasEspeciales {
    private final Integer precision;
    private final Integer fe;

    public EstadisticasEspeciales(Integer precision, Integer fe) {
        this.precision = precision;
        this.fe        = fe;
    }

    public boolean tienePrecision() {
        return precision != null; }
    public boolean tieneFe()        {
        return fe != null; }

    public Integer getPrecision() {
        return precision; }
    public Integer getFe()        {
        return fe; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (tienePrecision()) sb.append("Precisiom:").append(precision).append(" ");
        if (tieneFe()) sb.append("Fe:").append(fe);
        return sb.toString().trim();
    }
}