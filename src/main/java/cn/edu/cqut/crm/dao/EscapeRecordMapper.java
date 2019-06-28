package cn.edu.cqut.crm.dao;

import cn.edu.cqut.crm.model.EscapeRecord;
import cn.edu.cqut.crm.model.LoseCount;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EscapeRecordMapper {
    Integer insert(EscapeRecord escapeRecord);

    /**
     *
     * @param customerId 按照客户id进行选择
     * @return 返回一个List结果集
     */
    List<EscapeRecord> selectAsCustomerId(Integer customerId);


    /**
     *
     * @param creatorId 按照客户经理的id进行查询
     * @return 返回一个Lis结果集
     */
    List<EscapeRecord> selectAsCreatorId(Integer creatorId);

    /**
     *
     * @return 按照流失类型来进行统计，返回统计结果
     */
    List<LoseCount> selectAsEscapeReason();
}
