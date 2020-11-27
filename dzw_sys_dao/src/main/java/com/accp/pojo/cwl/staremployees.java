package com.accp.pojo.cwl;
/**
 * 	技工星级表
 * @author 团子等等俺
 *
 */
public class staremployees {
    private Integer id;//编码

    private Integer starlevel;//星级

    private Integer level;//等级

    private Float cuttheweight;//提成权重

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStarlevel() {
        return starlevel;
    }

    public void setStarlevel(Integer starlevel) {
        this.starlevel = starlevel;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Float getCuttheweight() {
        return cuttheweight;
    }

    public void setCuttheweight(Float cuttheweight) {
        this.cuttheweight = cuttheweight;
    }
    
    public staremployees() {}
    
	public staremployees(Integer id, Integer starlevel, Integer level, Float cuttheweight) {
		super();
		this.id = id;
		this.starlevel = starlevel;
		this.level = level;
		this.cuttheweight = cuttheweight;
	}

	@Override
	public String toString() {
		return "staremployees [id=" + id + ", starlevel=" + starlevel + ", level=" + level + ", cuttheweight="
				+ cuttheweight + "]";
	}
    
    
}