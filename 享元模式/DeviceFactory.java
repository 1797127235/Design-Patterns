package 享元模式;

import java.util.HashMap;

public class DeviceFactory {

    private HashMap<String, NetworkDevice> deviceMap = new HashMap<String, NetworkDevice>();
    private  int totalCount = 0;
    public NetworkDevice getDevice(String type)
    {
        NetworkDevice device = deviceMap.get(type);
        if(device == null)
        {
            if(type.equals("交换机"))
            {
                device = new Switch();
            }
            else if(type.equals("集线器"))
            {
                device = new Hub();
            }
            deviceMap.put(type, device);
            totalCount++;
        }
        return device;
    }
}
