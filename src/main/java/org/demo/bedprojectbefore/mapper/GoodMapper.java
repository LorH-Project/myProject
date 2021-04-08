package org.demo.bedprojectbefore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.pojo.Goods;

import java.util.List;

@Mapper
public interface GoodMapper {

    /**
     * 商品列表
     * @param goodsName
     * @param goodsManufactor
     * @param statr
     * @param end
     * @param pageNo
     * @param pageSize
     * @return
     */
    public List<Goods> goodList(@Param("goodsName") String goodsName,
                                @Param("goodsManufactor") String goodsManufactor,
                                @Param("start")String statr, @Param("end")String end,
                                @Param("pageNo")int pageNo, @Param("pageSize")int pageSize);

    public int getGoodCount(@Param("goodsName") String goodsName,
                            @Param("goodsManufactor") String goodsManufactor,
                            @Param("start")String statr,@Param("end")String end);

    /**
     * 根据id查商品信息
     * @param id
     * @return
     */
    public Goods selIdGood(@Param("id") int id);

    /**
     * 删除商品
     * @param id
     * @return
     */
    public int delGood(@Param("id") int id);

    /**
     * 新增商品
     * @param goods
     * @return
     */
    public int addGoods(Goods goods);

}
