public class Esfera
{
	double raio;
    double volumeEsfera()
    {
        double volume = (4.0 / 3.0) * 3.14 * (this.raio * this.raio * this.raio);
		return volume;
    }
}
