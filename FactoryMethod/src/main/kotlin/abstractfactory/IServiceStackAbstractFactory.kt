package abstractfactory

interface IServiceStackAbstractFactory {
    fun getEmployeeService(): IEmployeeService
    fun getProductService(): IProductService

}