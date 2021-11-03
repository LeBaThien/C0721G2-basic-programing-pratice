package bean.contract;

public class ContractDetail {
    private Integer contractDetailId;
    private Integer quantity;

    public ContractDetail(Integer contractDetailId, Integer quantity) {
        this.contractDetailId = contractDetailId;
        this.quantity = quantity;
    }

    public Integer getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(Integer contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
