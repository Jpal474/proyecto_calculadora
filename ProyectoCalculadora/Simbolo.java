class Simbolo{
    String nombre;
    Tipo var = new Tipo();
    public Simbolo(String nombre, Tipo var){
        this.nombre=nombre;
        this.var.id = var.id;
        if(var.id==0){
            this.var.vari=var.vari;
        }else{
            this.var.vard=var.vard;
        }
    }
}