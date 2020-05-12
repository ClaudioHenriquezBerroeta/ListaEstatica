public class ListaEstatica{
	int arreglo[];
	int ultimo;
	final int long_max;

	ListaEstatica(int n){
		if(n>=0)long_max=n;
		else long_max=200;

		arreglo= new int[long_max];
		ultimo=0;
	}
	void insertar(int x, int p){
		if(p>=long_max){
			System.out.println("Lista llena");
		}else{
			if((p<0)||(p>ultimo)){
				System.out.println("Posición inválida");
			}else{
				for(int i=ultimo;i>p;i--){
					arreglo[i]=arreglo[i-1];
				}
				arreglo[p]=x;
				ultimo++;
			}
		}
	}
	void mostrar(){
		for(int i=0;i<ultimo;i++){
			System.out.print(arreglo[i]+"-");
		}
		System.out.println('\b');
	}

	public static void main(String[] args) {
		ListaEstatica L = new ListaEstatica(10);
		L.insertar(10,1);
		L.insertar(20,0);
		L.mostrar();
	}
}