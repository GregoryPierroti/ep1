public class Lista{ 
	private No inicio,fim;
	public void getInicio(){
		this.inicio=inicio;
	}
	public	void getFim(){
		this.fim=fim;	
	}
	public int setInicio(){
		return inicio;
	}
	public int setFim(){
		return fim;
	}
	public	void inserir(int x){
		No novo= new No();
		novo.setX(x);
		if(fim=Null){
			inicio=novo;
			fim=novo;
		}	else{
				fim.setProx(x);
				fim=novo;
			}
	}
	public bool pesquisar(int y){
		No aux=new No();
		aux=setInicio();
		while(aux!=null){
			if(y==aux.getX(x)){
				return true;
			}
			return false;
		}
	}
	public void remover (int x){
		if(inicio!=null){
			fim.setAnt=null;
			fim=null;
			
		}
	}
}
}
	class No{ 
		public void getX(){
			this.x=x;
		}
		public 	void getProx(){
			this.prox=prox;
		}
		public void getAnt(){
			this.ant=ant;
		}
		int setProx(){
			return prox;	
		}
		int setAnt(){
			return ant;
		}
		private int x;
        private No* prox,ant;
 
}
