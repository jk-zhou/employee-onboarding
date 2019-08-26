package jkzhou.onboarding.api;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
public class ServiceResponse<T>
{
    private T payload;
    private String error;

    public ServiceResponse()
    {
    }

    public ServiceResponse(T payload)
    {
        this.payload = payload;
    }

    public String getError()
    {
        return error;
    }

    public T getPayload()
    {
        return payload;
    }

    public void setError(String error)
    {
        this.error = error;
    }

    public void setPayload(T payload)
    {
        this.payload = payload;
    }

    @Override
    public String toString()
    {
        return "ServiceResponse [payload=" + payload + ", error=" + error + "]";
    }
}
