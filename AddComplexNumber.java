class AddComplexNumber{
    int real; 
    int image;

    public AddComplexNumber(int r, int i){
        this.real = r;
        this.image = i;
    }

    public void showC(){
        System.out.println(this.real + "+i" + this.image);
    }

    public static AddComplexNumber add(AddComplexNumber n1, AddComplexNumber n2){
        AddComplexNumber res = new AddComplexNumber(0, 0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }

    public static void main(String[] args){
        AddComplexNumber c1 = new AddComplexNumber(1,2);
        AddComplexNumber c2 = new AddComplexNumber(4,5);

        System.out.print("First Complex number:");
        c1.showC();
        System.out.print("Second Complex number:");
        c2.showC();

        AddComplexNumber res = add(c1, c2);
        System.out.println("\nNew Complex Number is:");
        res.showC();
        


    }
}