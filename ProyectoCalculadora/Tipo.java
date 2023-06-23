public class Tipo{
    int vari;
    double vard;
    int id;
    //Objetos 
    Tipo(int v) {vari=v; id=0;}
    Tipo(double v) {vard=v; id=1;}
    //Metodos GET
    int getvari(){return vari;}
    double getvard(){return vard;}
    int getid(){return id;}

    Tipo(){
        vari=0;
        vard=0.0d;   
    }
}