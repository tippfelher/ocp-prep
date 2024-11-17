package a;

import b.BClass;

class AClass {
    public static void main(String[] args) {
        BClass b = new BClass();
        System.out.println(++b.var);
        System.out.println(++b.staticVar);
	}
}
