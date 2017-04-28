import java.util.NoSuchElementException;
public class SpaceAge{
private static final double earthSeconds = 31557600;
  private static final double mercurySeconds = 0.2408467 * earthSeconds;
  private static final double venusSeconds = 0.61519726 * earthSeconds;
  private static final double marsSeconds = 1.8808158 * earthSeconds;
  private static final double jupiterSeconds = 11.862615 * earthSeconds;
  private static final double saturnSeconds = 29.447498 * earthSeconds;
  private static final double uranusSeconds = 84.016846 * earthSeconds;
  private static final double neptuneSeconds = 164.79132 * earthSeconds;

  private double seconds;
	public SpaceAge(double seconds) {
		this.seconds = seconds;
	}
	public double getSeconds() {
		return seconds;
	}
	public double onEarth() {
		double result = seconds / earthSeconds;
		return result;
	}
	public double onMercury() {
		double result = seconds / mercurySeconds;
		return result;	 
	}
	public double onVenus() {
		double result = seconds / venusSeconds;
		return result;
	
	public double onMars() {
		double result =  seconds / marsSeconds;
		return result;
	}
	public double onJupiter() {
		double result =  seconds / jupiterSeconds;
		return result;
	}
	public double onSaturn() {
		double result = seconds / saturnSeconds;
		return result;
	}
	public double onUranus() {
		double result = seconds / uranusSeconds;
		return result;
	}
	public double onNeptune() {
		double result = seconds / neptuneSeconds;
		return result;
	}
}