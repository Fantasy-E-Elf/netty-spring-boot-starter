package co.wangming.nsb.vo;

import co.wangming.nsb.parsers.MessageParser;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Created By WangMing On 2019-12-08
 **/
@Data
@Builder
public class MethodInfo {

    private List<MessageParser> parameterInfoList;

    private String beanName;
}
