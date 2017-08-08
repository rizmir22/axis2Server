
/**
 * TemperatureConverterSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v14  Built on : Jul 25, 2015 (11:19:54 IST)
 */
    package ws.example;

import ws.example.xsd.C2FConvertionResponse;
import ws.example.xsd.F2CConvertionResponse;
    /**
     *  TemperatureConverterSkeleton java skeleton for the axisService
     */
    public class TemperatureConverterSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param f2CConvertion 
             * @return f2CConvertionResponse 
         */
        
                 public ws.example.xsd.F2CConvertionResponse f2CConvertion
                  (
                  ws.example.xsd.F2CConvertion f2CConvertion
                  )
            {
                	 F2CConvertionResponse response = new F2CConvertionResponse();
                	 response.set_return(((f2CConvertion.getFValue() - 32)*5)/9);
                	 return response;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param c2FConvertion 
             * @return c2FConvertionResponse 
         */
        
                 public ws.example.xsd.C2FConvertionResponse c2FConvertion
                  (
                  ws.example.xsd.C2FConvertion c2FConvertion
                  )
            {
                	 C2FConvertionResponse response = new C2FConvertionResponse();
                	 response.set_return(((c2FConvertion.getCValue() * 9 ) /5 ) + 32);
                	 return response;
        }
     
    }
    