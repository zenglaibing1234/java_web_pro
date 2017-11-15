package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.beans.TType;
import cn.uc.yiqibang.utils.Result;

public interface TTypeMapper {
    /**
     * 
     *����idɾ������
     */
    Result deleteByPrimaryKey(Integer id);

    /**
     *�������
     */
    Result insert(TType record);

    /**
     * �������
     */
    Result insertSelective(TType record);

    /**
     * ����id������������
     * @param id
     * @return
     */
    Result selectByPrimaryKey(Integer id);

    /**
     * ��������
     * @param record
     * @return
     */
    Result updateByPrimaryKeySelective(TType record);

    /**
     * ����id��������
     * @param record
     * @return
     */
    Result updateByPrimaryKey(TType record);
    
    Result selectAll();
}