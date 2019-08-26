package jkzhou.onboarding.api;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
public class ServiceRequest<T>
{
    private T payload;

    public ServiceRequest()
    {
    }

    public ServiceRequest(T payload)
    {
        this.payload = payload;
    }

    public T getPayload()
    {
        return payload;
    }

    public void setPayload(T payload)
    {
        this.payload = payload;
    }

    @Override
    public String toString()
    {
        return "ServiceRequest [payload=" + payload + "]";
    }
}
