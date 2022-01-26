open module org.example.appserver {
    requires org.junit.jupiter;
    // require Mockito here
    requires org.mockito;
    // very important, Mockito needs it
    requires net.bytebuddy;
    requires org.assertj.core;
}