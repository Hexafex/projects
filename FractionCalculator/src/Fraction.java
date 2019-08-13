public class Fraction {
 private int numerator;
 private int denominator;

 public Fraction (int userNumerator,int userDenominator){
     numerator = userNumerator;
     denominator = userDenominator;
     if(denominator==0) {
         throw new IllegalArgumentException("Denominator cannot be zero");
     }
     if(userDenominator<0){
         numerator=-getNumerator();
         denominator=-getDenominator();
     }

 }
 public Fraction (int userNumerator ){
     this(userNumerator,1);
 }
 public Fraction (){
     this(0,0);
 }

        public int getNumerator(){

            return numerator;
        }
        public int getDenominator(){

                 return denominator;
        }
        public String toString(){
            String fraction= getNumerator()+"/"+ getDenominator();
            return fraction;
        }
        public double toDouble(){
     double fractionResult= getNumerator()/getDenominator();

     return fractionResult;

        }
        public Fraction add(Fraction other){
        int topNum =(getNumerator()*other.getDenominator())+(getDenominator()*other.getNumerator());
        int btmNum =getDenominator()*other.getDenominator();
        Fraction result = new Fraction(topNum,btmNum);
        return result;

        }
        public Fraction subtract(Fraction other){
            int topNum =(getNumerator()*other.getDenominator())-(getDenominator()*other.getNumerator());
            int btmNum =getDenominator()*other.getDenominator();
            Fraction result = new Fraction(topNum,btmNum);
            return result;

        }
        public Fraction multiply(Fraction other){
            int topNum =(getNumerator()*other.getNumerator());
            int btmNum =getDenominator()*other.getDenominator();
            Fraction result = new Fraction(topNum,btmNum);
            return result;

        }
        public Fraction divide(Fraction other){
            int topNum =(getNumerator()*other.getDenominator());
            int btmNum =getDenominator()*other.getNumerator();
            Fraction result = new Fraction(topNum,btmNum);
            return result;

        }

        @Override
        public boolean equals(Object other) {
        boolean isEquals = false;
        if (other instanceof Fraction) {
            Fraction fract = (Fraction) other;
            if (getNumerator() / getDenominator() == (fract.getNumerator() / fract.getDenominator())) {
                isEquals = true;
            }

        }
            return isEquals;
    }

        public Fraction toLowestTerms(){
            int a;int b;
            Fraction result;
            a=getNumerator();b=getDenominator();
            int t = gcd(a,b);
            if(t>b||t<a){
                int topNum=a / t;
                int btmNum=b / t;
                 result =new Fraction(topNum,btmNum);

            }else {
                int topNum = a / t;
                int btmNum = b / t;
                result =new Fraction(topNum,btmNum);
            }

            return result;
        }
        public int gcd(int num,int den) {
                if (num<0){num=-num;}
                if (den<0){den=-den;}
                if ( num<0){
                    num= -num;
                }else if( den<0){
                    den= -den;
                }
                while (num != den) {
                    if (num>den) {
                        num-=den;
                    } else{
                        den -= num;
                    }if(num==0){
                        return num;
                    }

                }
            return num;
 }
}