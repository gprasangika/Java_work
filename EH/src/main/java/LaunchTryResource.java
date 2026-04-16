class Telusko implements AutoCloseable{

      public void close() throws Exception{
        System.out.println("Resource is getting closed");
    }
}


public class LaunchTryResource {
    static void main(String[] args) throws Exception{

        try (Telusko t1 = new Telusko())
        {
            System.out.println("Resource is open");
        }
//        finally
//        {
//            t.close();
//        }
    }
}




// when child class overrides methods in parent class, if parent method doesn't throw exception,
// child method can throw unchecked exception
// child method can't throw checked exception

//Lisco substitution principle

// when child class overrides methods in parent class, if parent method throws unchecked exception,
// child method can throw same unchecked exception
// child method can throw different unchecked exception
// child method can throw no exception


// when child class overrides methods in parent class, if parent method throws checked exception,
// child method can throw same checked exception
// child method can throw child class exception of the checked exception
// child method can throw no exception
// child method can't throw superclass exception of checked exception