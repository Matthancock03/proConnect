
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object about extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("ProConnect")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*2.31*/routes/*2.37*/.Assets.at("stylesheets/splash.min.css"))),format.raw/*2.77*/("""">
<div class="container-fluid">


	<div class="row clearfix topSplash">
    <nav class="navbar navbar-inverse">
  				<div class="navbar-header">
  					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
  						<span class="sr-only">Toggle navigation</span>
  						<span class="icon-bar"></span>
  						<span class="icon-bar"></span>
  						<span class="icon-bar"></span>
  					</button>
  					<a class="navbar-brand" href=""""),_display_(Seq[Any](/*15.39*/securesocial/*15.51*/.controllers.routes.LoginPage.login().absoluteURL())),format.raw/*15.102*/("""">ProConnect</a>
  				</div>
  				<div id="navbar" class="collapse navbar-collapse">
  			</div>
  		</nav>

      <div class="col-xs-3 column">
  		</div>
      <div class="col-xs-6 column">
				<h1 class ="header-text text-left"> ProConnect </h1>
				<h1 class ="text-center">Connect with Proffesionals</h1>
  		</div>
  		<div class="col-xs-3 column">
  		</div>
    </div>

	</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="row clearfix">
					<div class="col-md-4 column">
						<h2>
							Getting Started
						</h2>
						<p>
							Our purpose is to connect with other proffesionals and share skill sets and accomplisments. Hiring managers and recruiters have the ability to search a compiled database of candidates that meet their criteria.
						</p>
						<p>
							<a class="btn" href="#">Get Started Here »</a>
						</p><img alt="140x140" src = "  http://proconnect.herokuapp.com/assets/images/proConnect.jpg " class="img-rounded" />
					</div>
					<div class="col-md-4 column">
					</div>
					<div class="col-md-4 column">
						<h2>
							Take proConnect with you
						</h2>
						<p>
ProConnect provides an Android application were users can disscuss and share experiences on the go.
						</p>
						<p>
							<a class="btn" href="#">View details »</a>
						</p><img alt="140x140" src=" http://www.smallbusinesscomputing.com/imagesvr_ce/9337/Technology_350.jpg" class="img-rounded" />
					</div>
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-4 column">
			</div>
			<div class="col-md-4 column">
			</div>
			<div class="col-md-4 column">
			</div>








      <div class="row clearfix">
        <div class="col-xs-3 column">
    		</div>
        <div class="col-xs-6 column">
<<<<<<< HEAD
          <h1 class ="text-center"></h1>
=======








       
                    <h3 style="color:green",class ="text-left">  <b> About us </b>
                    <p> 
                    Welcome to Proconnect, a professional networking service - a networking service that helps professional to connect with worlds of professions
                     </p>
</h3>
<p></p>
                    <h3 style="color:black",class ="text-left",style="font-size:200%"> <b>Mission</b>
                    <p>
                     Our Mission is to help people to create a profile and connect with other professionals, to join discussions, share experiences, and make announcements.
                    </p>
</h3> 
<p></p>

                   <h3 style="color:green",class ="text-left">  <b>Information</b>
                    <p> 
                   Procennect is publicly held and has a diversified business model
                    </p>
                    <p></p>
                    <p></p>
                    <p style="color:black">                  
                      For more information about our company, please visit our Company Page.
                      </p>
                    <p>
                      
                    </p>
                    <p></p>
             <p>
              For more information, please contact us at proconect.com.
             </p>
          
   </h3>

>>>>>>> 7c95026abe9834688ea1a9556ae5cae74d40ba7f
        </div>
        <div class="col-xs-3 column">
        </div>
      </div>
<<<<<<< HEAD
""")))})),format.raw/*86.2*/("""
=======
""")))})),format.raw/*79.2*/("""
>>>>>>> 7c95026abe9834688ea1a9556ae5cae74d40ba7f
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Wed Apr 15 22:26:43 PDT 2015
                    SOURCE: C:/Users/Daisy/Documents/GitHub/proConnect/web-app/app/views/about.scala.html
                    HASH: 8787aacf1bad6b99ba99c932fb11d2844e5be121
                    MATRIX: 864->1|890->19|928->20|995->52|1009->58|1070->98|1645->637|1666->649|1740->700|3747->2676
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|43->15|43->15|43->15|114->86
=======
                    DATE: Wed Apr 15 15:58:58 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/about.scala.html
                    HASH: 8195ddc2575694defe6b02af91b33aaf1c672738
                    MATRIX: 864->1|890->19|928->20|995->52|1009->58|1070->98|1645->637|1666->649|1740->700|3711->2640
                    LINES: 29->1|29->1|29->1|30->2|30->2|30->2|43->15|43->15|43->15|107->79
>>>>>>> 7c95026abe9834688ea1a9556ae5cae74d40ba7f
                    -- GENERATED --
                */
            