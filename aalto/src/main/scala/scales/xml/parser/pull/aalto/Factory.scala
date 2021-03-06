package scales.xml.parser.pull.aalto

import com.fasterxml.aalto._
import com.fasterxml.aalto.stax.InputFactoryImpl

import scales.xml._

import scales.utils.resources.SimpleUnboundedPool

/**
 * Default AsyncXMLInputFactory impl
 */ 
object AsyncXMLInputFactoryPool extends SimpleUnboundedPool[AsyncXMLInputFactory] { pool =>
  
  val cdata = "http://java.sun.com/xml/stream/properties/report-cdata-event"

  def create = {
    val fac = new InputFactoryImpl()
    if (fac.isPropertySupported(cdata)) {
      fac.setProperty(cdata, java.lang.Boolean.TRUE);
    }
    fac
  }
										   }
