package p1;

// Marker Annotation ->
@interface MyAnnotation1 {
}

// Single value Annotation
@interface MyAnnotation2 {
    //    String value();
    String[] value();
}

// Multi-Value Annotations
@interface MyAnnotation3 {
    String path();

    String method();
}

@MyAnnotation1 // Marker Annotation
//@MyAnnotation2("sunbeam")
@MyAnnotation2({"sunbeam", "Infotech"})
@MyAnnotation3(path = "/", method = "GET")
public class Program3 {
    public static void main(String[] args) {

    }
}
