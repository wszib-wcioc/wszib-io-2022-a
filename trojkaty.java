/**
* To jest program do rozpoznawania trójkąta.
*/

class Trojkaty {
    /**
     * Główna funkcja programu.
     * @param {float} a - Długość pierwszego boku.
     * @param {float} b - Długość drugiego boku.
     * @param {float} c - Długość trzeciego boku.
     */
	public static boolean czyProstokatny(float a, float b, float c){
                   if (a * a + b * b == c*c) return true;
                   if (b * b + c * c == a*a) return true;
                   if (a * a + c * c == b*b) return true;
                   return false;
               }
    public static void jakiTrojkat(float a, float b, float c){
         if (a == b && b == c && a == c) {
             System.out.println("Trójkąt równoboczny"); 
         }
	if (a == b || b == c || a == c) {
                    System.out.println("Trójkąt równoramienny");
         }
	if (czyProstokatny(a, b, c)) {
                    System.out.println("Trójkąt prostokątny");
                  }
         // TODO: tutaj trzeba bedzie dopisac inne przypadki
    }
    /** Wyświetla ekran pomocy */
    public static void pomoc(){
        System.out.println("Acme INC. (C) 2022");
        System.out.println("Program do rozpoznawania rodzaju trójkąta");
        System.out.println("Uruchom z trzema argumentami liczbowymi - długość boków trójkąta");
    }
    /** Glowna funkcja */
    public static void main(String... args) {
        if (args.length != 3) {
            pomoc();
            System.exit(1);
        }
        float a = Float.valueOf(args[0]);
        float b = Float.valueOf(args[1]);
        float c = Float.valueOf(args[2]);
        
        jakiTrojkat(a, b, c);
    }
}
