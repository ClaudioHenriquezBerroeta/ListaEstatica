public class ListaEstatica{
	int arreglo[];
	int ultimo;
	final int long_max;

	ListaEstatica(int n){
		if(n>0)long_max=n;
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
	void eliminar(int p){
		if(ultimo==0){//lista no tiene elemento
			System.out.println("Lista vacia, no es posible eliminar!");
		}else{
			if((p<0)||(p>=ultimo)){
				System.out.println("Posicion invalida, no es posible eliminar!");
			}else{
				for(int i=p;i<ultimo-1;i++){
					arreglo[i]=arreglo[i+1];
				}
				ultimo--;
			}
		}
	}

	public static void main(String[] args) {
		ListaEstatica L = new ListaEstatica(10);
		L.eliminar(0);
		L.insertar(10,0);
		L.insertar(10,1);
		L.insertar(30,2);
		L.insertar(10,3);
		L.mostrar();
		L.eliminar(2);
		L.mostrar();
	}
}