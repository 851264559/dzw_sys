package com.accp.pojo.cwl;
/**
 * 	�����Ǽ���
 * @author ���ӵȵȰ�
 *
 */
public class staremployees {
    private Integer id;//����

    private Integer starlevel;//�Ǽ�

    private Integer level;//�ȼ�

    private Float cuttheweight;//���Ȩ��

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