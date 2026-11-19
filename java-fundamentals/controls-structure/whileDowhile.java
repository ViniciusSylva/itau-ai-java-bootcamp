public static void main(String[] args) {
    var  i = 0;
    while (args.length > 1) {
        System.out.println(args[i]);
        i++;
    }
    
    System.out.println("=================");

    do {
        System.out.println(args[i]);
        i++;
    }while (args.length > 1);

}