package com.youran.generate.pojo.vo;

import com.youran.generate.pojo.dto.MetaMtmFeatureDTO;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 * @author: cbb
 * @date: 2017/7/4
 */
public class MetaManyToManyShowVO extends MetaManyToManyListVO {

    private MetaMtmFeatureDTO feature;

    public MetaMtmFeatureDTO getFeature() {
        return feature;
    }

    public void setFeature(MetaMtmFeatureDTO feature) {
        this.feature = feature;
    }
}
