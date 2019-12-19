class A{
	int a =20;
	void inner(){
		class In{
                    void p(){
                        System.out.println(a);
                    }
                    
	}

	In b = new In();
	b.p();
}
	public static void main(String args[]){
	 A a = new A();
	a.inner();
	}
}