package org.demo.bedprojectbefore.service;

import org.apache.ibatis.annotations.Param;
import org.demo.bedprojectbefore.mapper.GoodMapper;
import org.demo.bedprojectbefore.pojo.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodSer {

    @Resource
    private GoodMapper goodMapper;

    public List<Goods> goodList(@Param("goodsName") String goodsName,
                                @Param("goodsManufactor") String goodsManufactor,
                                @Param("start")String statr, @Param("end")String end,
                                @Param("pageNo")int pageNo, @Param("pageSize")int pageSize) {
        return goodMapper.goodList(goodsName, goodsManufactor, statr, end, (pageNo-1)*pageSize, pageSize);
    }

    public int getGoodCount(@Param("goodsName") String goodsName,
                            @Param("goodsManufactor") String goodsManufactor,
                            @Param("start")String statr,@Param("end")String end){
        return goodMapper.getGoodCount(goodsName, goodsManufactor, statr, end);
    }

    public int delGood(@Param("id") int id){
        return goodMapper.delGood(id);
    }

    public Goods selIdGood(@Param("id") int id){
        return goodMapper.selIdGood(id);
    }

    public int addGoods(Goods goods){
        return goodMapper.addGoods(goods);
    }

    public int updateGoods(Goods goods){
        return goodMapper.updateGoods(goods);
    }

    public int deleteGoodsById(@Param("ids") String[] ids){
        return  goodMapper.deleteGoodsById(ids);
    }


}
