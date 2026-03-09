package vetores;

public class Vet3 {
	//variáveis de instância
	private float x,y,z;

	//construtores
	public Vet3() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	public Vet3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//Getters e Setters
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	//Métodos
	public float tamanhoVetor() {
		float tamanho =0;
		
		tamanho = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		
		return tamanho;
	}

	public void normalizaVetor() {
		float tamanho;
		tamanho = this.tamanhoVetor();
		
		this.x = x/tamanho;
		this.y = y/tamanho;
		this.z = z/tamanho;
	}

	public void adicaoVetores(Vet3 vet) {
		this.x = x + vet.getX();
		this.y = y + vet.getY();
		this.z = z + vet.getZ();
	}

	public void multiplicacaoEscalar(float n) {
		this.x = x*n;
		this.y = y*n;
		this.z = z*n;
	}

	public void divisaoEscalar(float n) {
		this.x = x/n;
		this.y = y/n;
		this.z = z/n;
	}

	public float produtoEscalar(Vet3 vet) {
		float produto = 0;
		
		produto = (x*vet.getX()) + (y*vet.getY()) + (z*vet.getZ());
		
		return produto;
	}

	public Vet3 copiaVet3() {
		Vet3 copia = new Vet3(this.x, this.y, this.z);
		
		return copia;
	}

	public float[] arrayVet3() {
		float[] array = new float[3];
		
		array[0] = this.x;
		array[1] = this.y;
		array[2] = this.z;
		
		return array;
	}
	
}
