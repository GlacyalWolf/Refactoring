# Exercici 1. El meu exemple
_________________________________________________________________

Descriu un exemple de canvi de codi teu que es pugui considerar refacció i un altre que no. Pots fer servir codi de qualsevol dels teus exercicis del cicle (especifica la procedència). No oblidis descriure el perquè de la teva classificació basant-te en els conceptes d’aquesta secció.


Aquest codi esta extret de un exercici de la classe de programació.

    static void sum(int num2,int num1){
            System.out.println(num2+x);
        }
    static void resta(int num2,int num1){
            System.out.println(num2-num1);
        }
    static void mult(int num2,int num1){
            System.out.println(num2*num1);
        }
    static void div(int num2,int num1){
            if(num1>0){
                System.out.println(num1/num2);
                }
            else{
                System.out.println("tu no divideixis entra 0 duleeen");
                }
        }
    public static void main (String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String comp="s";
    while(comp.equals("s")){
        System.out.print("Entra el primer numero: ");
        String snum1=reader.readLine();
        int num1=Integer.parseInt(snum1);
        System.out.print("posa el operador + - * /: ");
        String oper=reader.readLine();
        System.out.print("Entra el segon numero: ");
        String snum2=reader.readLine();
        int num2=Integer.parseInt(snum2);
        if (oper.equals("+")){
            sum(num1,num2);
            }
        if (oper.equals("-")){
            resta(num1,num2);
            }
        if (oper.equals("*")){
            mult(num1,num2);
            }
        if (oper.equals("/")){
            div(num1,num2);
            }
        System.out.println("vols cointinuar s/n?");
        comp=reader.readLine();
        }
    }

El problema del codi i perque li vaig fer un refarctoring es que en els moduls per fer les operacions els operadors es diuen **X** i **Y** i els vaig canviar per **num1** i **num2**.

* * *







