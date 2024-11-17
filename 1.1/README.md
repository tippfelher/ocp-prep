```ps
> java21 a/AClass.java
a\AClass.java:3: error: package b does not exist
import b.BClass;
        ^
a\AClass.java:7: error: cannot find symbol
        BClass b = new BClass();
        ^
  symbol:   class BClass
  location: class AClass
a\AClass.java:7: error: cannot find symbol
        BClass b = new BClass();
                       ^
  symbol:   class BClass
  location: class AClass
3 errors
error: compilation failed
```

```ps
> java23 a/AClass.java
1
1
```
