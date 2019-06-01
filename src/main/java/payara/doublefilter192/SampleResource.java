package payara.doublefilter192;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("sample")
public class SampleResource {
    @GET
    public String getSample() {
        return "Sample";
    }
}
