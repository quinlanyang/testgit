import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;

/**
 *  2.0
 * @author Yql
 * @create 2019/1/15
 */
public class Main {
    public static void main(String[] args) {
        // 创建DefaultAcsClient实例并初始化
        DefaultProfile profile = DefaultProfile.getProfile(
                "default",          // 地域ID
                "LTAIDVewF8ThajLm",      // RAM账号的AccessKey ID
                "Ow5WuLMeo9y98sWvK0ob2MRq7MsGYr"); // RAM账号Access Key Secret
        IAcsClient client = new DefaultAcsClient(profile);
        // 创建API请求并设置参数
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageSize(10);
        request.setConnectTimeout(5000); //设置连接超时为5000毫秒
        request.setReadTimeout(5000); //设置读超时为5000毫秒
        // 发起请求并处理应答或异常
        DescribeInstancesResponse response;
        try {
            response = client.getAcsResponse(request);
            for (DescribeInstancesResponse.Instance instance:response.getInstances()) {
                System.out.println(instance.getPublicIpAddress());
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
