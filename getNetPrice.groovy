import groovy.transform.Field

@Field def Products=[
        ['ProductID': 'ARK-0001',
         'Label' : 'PlasticChair',
         'UOM': 'PCE',
         'Industry': 'Chemicals',
         'ProductGroup' : 'Homeware',
         'ProductType' : 'Furniture',
         'PackagingType' : 'Bulk',
         'Color' : 'Blue'
        ],
        ['ProductID' : 'ARK-0002',
         'Label' : 'Desk',
         'UOM': 'PCE',
         'Industry': 'Chemicals',
         'ProductGroup' : 'Office Essentials',
         'ProductType' : 'Furniture',
         'PackagingType' : 'Bulk',
         'Color' : 'Black'
        ],
        ['ProductID' : 'ARK-0003',
         'Label' : 'Couch',
         'UOM': 'PCE',
         'Industry': 'Chemicals',
         'ProductGroup' : 'Homeware',
         'ProductType' : 'Furniture',
         'PackagingType' : 'Bulk',
         'Color' : 'White'
        ],
        ['ProductID' : 'ARK-0004',
         'Label' : 'Cabinet',
         'UOM': 'PCE',
         'Industry': 'Chemicals',
         'ProductGroup' : 'Homeware',
         'ProductType' : 'Furniture',
         'PackagingType' : 'Bulk',
         'Color' : 'Blue'
        ]

]
@Field def customers =[
        ['CustomerID' : 'CS-0001',
         'Name' : 'Jononi Furniture',
         'Country': 'Bangladesh',
         'Address': 'Jhautola, Cumilla',
         'Classification': 'A',
         'Type' : 'Direct'],
        ['CustomerID' : 'CS-0002',
         'Name' : 'AB Furniture',
         'Country': 'Bangladesh',
         'Address': 'Kandirpar, Cumilla',
         'Classification': 'A',
         'Type' : 'Direct'],
        ['CustomerID' : 'CS-0003',
         'Name' : 'CD Furniture',
         'Country': 'Bangladesh',
         'Address': 'Kandirar, Cumilla',
         'Classification': 'B',
         'Type' : 'Direct'],
        ['CustomerID' : 'CS-0004',
         'Name' : 'EF Furniture',
         'Country': 'Bangladesh',
         'Address': 'Jhautola, Cumilla',
         'Classification': 'B',
         'Type' : 'Direct']

]

@Field def productCost=[
        ['ProductID': 'ARK-0001',
         'Cost' :45],
        ['ProductID': 'ARK-0002',
         'Cost' :50],
        ['ProductID': 'ARK-0003',
         'Cost' :75],
        ['ProductID': 'ARK-0004',
         'Cost' :100]

]
@Field def costPlusPrice =[
        ['ProductGroup':'Homeware',
         'Adjustment':300],

        ['ProductGroup':'Office Essentials',
         'Adjustment':200]
]
@Field def priceDiscount= [
        ['ProductID' : 'ARK-0001',
         'CustomerID' : 'CS-0001',
         'Discounts' : '2%'],
        ['ProductID' : 'ARK-0002',
         'CustomerID' : 'CS-0002',
         'Discounts' : '1.5%'],
        ['ProductID' : 'ARK-0003',
         'CustomerID' : 'CS-0003',
         'Discounts' : '2%'],
        ['ProductID' : 'ARK-0004',
         'CustomerID' : 'CS-0004',
         'Discounts' : '1%']
]

@Field  def packagingAdjustment=[
        ['ProductGroup':'Homeware',
         'PackagingAdjustment':'5%'
        ],
        ['ProductGroup':'Office Essentials',
         'PackagingAdjustment':'10%'
        ]


]

@Field def packagingCost=[
        ['ProductGroup':'Homeware',
         'PackagingCost':'2.1%'
        ],
        ['ProductGroup':'Office Essentials',
         'PackagingCost':'3%'
        ]
]
@Field def warehouseAdjustment=[
        ['ProductGroup':'Homeware',
         'WarehouseAdjustment':'10%'
        ],
        ['ProductGroup':'Office Essentials',
         'WarehouseAdjustment':'20%'
        ]


]

@Field def warehouseCost=[
        ['ProductGroup':'Homeware',
         'WarehouseCost':'2.1%'
        ],
        ['ProductGroup':'Office Essentials',
         'WarehouseCost':'2%'
        ]
]

@Field def promotionDiscount=[
        ['ProductID' : 'ARK-0001',
         'CustomerID' : 'CS-0001',
         'PromotionName':'Volume Discount',
         'PromotionType':'Percent',
         'PromotionAmount':'2%',
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ],
        ['ProductID' : 'ARK-0002',
         'CustomerID' : 'CS-0002',
         'PromotionName':'Sales Channel Discount',
         'PromotionType':'Absolute',
         'PromotionAmount':23,
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ],
        ['ProductID' : 'ARK-0003',
         'CustomerID' : 'CS-0003',
         'PromotionName':'Volume Discount',
         'PromotionType':'Percent',
         'PromotionAmount':'2.5%',
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ],
        ['ProductID' : 'ARK-0004',
         'CustomerID' : 'CS-0004',
         'PromotionName':'Sales Channel Discount',
         'PromotionType':'Absolute',
         'PromotionAmount':30,
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ]
]




@Field def rebateAgreement=[
        ['ProductID' : 'ARK-0001',
         'CustomerID' : 'CS-0001',
         'AgreementName':'Yearly Agreement',
         'AgreementID':'RBA-0001',
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ],
        ['ProductID' : 'ARK-0002',
         'CustomerID' : 'CS-0002',
         'AgreementName':'Monthly Agreement',
         'AgreementID':'RBA-0002',
         'ValidFrom':'2022-02-01',
         'ValidTo':'2022-11-31'
        ],
        ['ProductID' : 'ARK-0003',
         'CustomerID' : 'CS-0003',
         'AgreementName':'Monthly Agreement',
         'AgreementID':'RBA-0003',
         'ValidFrom':'2022-03-01',
         'ValidTo':'2022-10-31'
        ]
]
@Field def rebateRecord=[
        ['RecordID':'RR-0001',
         'AgreementID':'RBA-0001',
         'Rebate':32,
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ],
        ['RecordID':'RR-0002',
         'AgreementID':'RBA-0002',
         'Rebate':20,
         'ValidFrom':'2022-02-01',
         'ValidTo':'2022-11-31'
        ],
        ['RecordID':'RR-0003',
         'AgreementID':'RBA-0003',
         'Rebate':10,
         'ValidFrom':'2022-03-01',
         'ValidTo':'2022-10-31'
        ]

]
def getBasePrice ( String productID) {
    def productCostMap = productCost.find{ it.ProductID == productID}
    def cost = productCostMap.getAt("Cost")
    def productsMap = Products.find{ it. ProductID == productID}
    def productGroup= productsMap.getAt("ProductGroup")
    def costPlusPriceMap =   costPlusPrice.find{ it.ProductGroup == productGroup }
    def adjustment = costPlusPriceMap.getAt("Adjustment")
    def basePrice= cost+adjustment as BigDecimal
    return basePrice

}

def getDiscount(String productID, BigDecimal basePrice){
    def priceDiscountMap= priceDiscount.find{it.ProductID == productID}
    def discount= priceDiscountMap.getAt("Discounts")
    discount= basePrice*(discount.substring(0,discount.length()-1) as BigDecimal)/100
    return discount
}

def getPackagingOrWarehouseAdjustment( String productGroup, String adjustmentType, List adjustment, BigDecimal basePrice){
    def adjustmentMap= adjustment.find{it.ProductGroup==  productGroup }
    packagingOrWarehouseAdjustment = adjustmentMap.getAt(adjustmentType)

    packagingOrWarehouseAdjustment= basePrice*(packagingOrWarehouseAdjustment.substring(0,packagingOrWarehouseAdjustment.length()-1) as BigDecimal)/100
return packagingOrWarehouseAdjustment
}

def getPackagingOrWarehouseCost( String productGroup, String costType, List adjustment, BigDecimal basePrice){
    def adjustmentMap= adjustment.find{it.ProductGroup==  productGroup }
    getPackagingOrWarehouseCost = adjustmentMap.getAt(costType)

    getPackagingOrWarehouseCost= basePrice*(getPackagingOrWarehouseCost.substring(0,getPackagingOrWarehouseCost.length()-1) as BigDecimal)/100
return getPackagingOrWarehouseCost
}
def getPromotionDiscount(String productID, List promotionDiscount,String promotionType, BigDecimal basePrice ){
    if (promotionType == 'Absolute' ){
        def promotionDiscountMap= promotionDiscount.find{ it.ProductID==productID}
        promotionDisCount= promotionDiscountMap.getAt("PromotionAmount")
    }
    else{
        def promotionDiscountMap= promotionDiscount.find{ it.ProductID==productID}
        promotionDisCount= promotionDiscountMap.getAt("PromotionAmount")
        promotionDisCount=basePrice*(promotionDisCount.substring(0,promotionDisCount.length()-1))as BigDecimal/100
    }
return promotionDisCount
} 

def basePrice=getBasePrice('ARK-0002')
def discount=getDiscount('ARK-0002', basePrice)
def packagingAdjustmentOfProduct= getPackagingOrWarehouseAdjustment('Office Essentials','PackagingAdjustment', packagingAdjustment,basePrice   )
def wareHouseAdjustmentOfProduct= getPackagingOrWarehouseAdjustment('Office Essentials','WarehouseAdjustment', warehouseAdjustment ,basePrice)
def  packagingCostOfProduct=getPackagingOrWarehouseCost('Office Essentials','PackagingCost', packagingCost ,basePrice )
def warehouseCostOfProduct=getPackagingOrWarehouseCost('Office Essentials','WarehouseCost', warehouseCost ,basePrice )
def promotionDiscountOfProduct=getPromotionDiscount('ARK-0002',promotionDiscount,'Absolute',basePrice)
def invoicePrice= basePrice+packagingAdjustmentOfProduct+wareHouseAdjustmentOfProduct-discount
def netPrice=invoicePrice-packagingCostOfProduct-warehouseCostOfProduct-promotionDiscountOfProduct
println(basePrice)
println(invoicePrice)
println(netPrice)
