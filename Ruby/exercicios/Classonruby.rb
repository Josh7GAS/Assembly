class Customer
    @@no_of_customers = 0
    def initialize(id, name, addr)
        @cust_id = id
        @cust_name = name 
        @cust_name = addr
    end
    
end

cust1= Customer.new("1", "John", "Wisdom Apartmens", "Ludhiya")
cust2= Customer.new("2", "Poul", "New Empire road", "Khandala")



