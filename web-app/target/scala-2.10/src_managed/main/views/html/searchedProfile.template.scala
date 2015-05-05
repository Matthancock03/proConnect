
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
object searchedProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[UserModel,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:UserModel):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*4.1*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*5.31*/routes/*5.37*/.Assets.at("stylesheets/profile.min.css"))),format.raw/*5.78*/("""">

"""),_display_(Seq[Any](/*7.2*/main("ProConect")/*7.19*/{_display_(Seq[Any](format.raw/*7.20*/("""
"""),_display_(Seq[Any](/*8.2*/navbar/*8.8*/.render)),format.raw/*8.15*/("""


<div class="container">
  <div class="row clearfix">
    <div class="col-md-2 column img-div">
      """),_display_(Seq[Any](/*14.8*/if(user.profilePicture != null)/*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""
        <img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*15.57*/routes/*15.63*/.DbController.getProfilePic(user.email))),format.raw/*15.102*/("""" />
      """)))}/*16.8*/else/*16.12*/{_display_(Seq[Any](format.raw/*16.13*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.71*/routes/*17.77*/.Assets.at("images/profile_holder.png"))),format.raw/*17.116*/("""" />
        """)))})),format.raw/*18.10*/("""
        """),_display_(Seq[Any](/*19.10*/if(user.userName != null)/*19.35*/{_display_(Seq[Any](format.raw/*19.36*/("""
              <h4>"""),_display_(Seq[Any](/*20.20*/user/*20.24*/.userName)),format.raw/*20.33*/("""</h4>
            """)))}/*21.14*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*23.14*/("""
  <a href=""""),_display_(Seq[Any](/*24.13*/routes/*24.19*/.UserController.addConnection(user.email))),format.raw/*24.60*/(""""><button type="button" class="btn btn-default edit-button" name="connect">Connect</button></a>

      <!-- Large modal -->
  <button type="button" class="btn btn-default edit-button" data-toggle="modal" data-target=".bs-example-modal-lg">Send Message</button>

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*33.12*/form(routes.UserController.sendMessage())/*33.53*/{_display_(Seq[Any](format.raw/*33.54*/("""

          	<div class="form-group" style="width: 50%; margin: 0 auto;">
            <div style="width: 75%; margin: 0 auto;">
          		<h2 class="form-signin-heading">Message</h2>
          			<input class="form-control"
          					placeholder="Message Title"
          					type="text"
          					name="messageTitle"
          					id="messageTitle"
          					value=""
          				/>
          			<input class="form-control"
          					placeholder="Message"
          					type="text"
          					name="messageBody"
          					id="messageBody"
          					value=""
          				/>
                  <input class="form-control"
            					placeholder="Message"
            					type="text"
            					name="email"
            					id="email"
            					value=""""),_display_(Seq[Any](/*57.26*/user/*57.30*/.email)),format.raw/*57.36*/(""""
                      style="display: none;"
            				/>

          		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%;">Send Message</button>
            </div>
        	</div>
          	""")))})),format.raw/*64.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->


    </div>
    <div class="col-xs-2"></div>

    <div class="col-md-6 column" style="background-color: #FFFFFF;">
        """),_display_(Seq[Any](/*74.10*/if(user.aboutMe != null)/*74.34*/{_display_(Seq[Any](format.raw/*74.35*/("""
          <h3>"""),_display_(Seq[Any](/*75.16*/user/*75.20*/.aboutMe)),format.raw/*75.28*/("""</h3>
        """)))})),format.raw/*76.10*/("""

      """),_display_(Seq[Any](/*78.8*/if(user.currentEmployer != null)/*78.40*/{_display_(Seq[Any](format.raw/*78.41*/("""
          <h3>"""),_display_(Seq[Any](/*79.16*/user/*79.20*/.currentEmployer)),format.raw/*79.36*/("""</h3>
        """)))})),format.raw/*80.10*/("""

      """),_display_(Seq[Any](/*82.8*/if(user.location != null)/*82.33*/{_display_(Seq[Any](format.raw/*82.34*/("""
          <h3>"""),_display_(Seq[Any](/*83.16*/user/*83.20*/.location)),format.raw/*83.29*/("""</h3>
        """)))})),format.raw/*84.10*/("""
    </div>
    <div class="col-xs-2"></div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
      <div class="col-xs-8 column" style="background-color: #FFFFFF;">
        <h2>
          About Me
        </h2>
        """),_display_(Seq[Any](/*96.10*/if(user.aboutMe != null)/*96.34*/{_display_(Seq[Any](format.raw/*96.35*/("""
          <p>
            """),_display_(Seq[Any](/*98.14*/user/*98.18*/.aboutMe)),format.raw/*98.26*/("""
          </p>
        """)))})),format.raw/*100.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*112.8*/if(user.experience != null)/*112.35*/{_display_(Seq[Any](format.raw/*112.36*/("""
      <p>
        """),_display_(Seq[Any](/*114.10*/user/*114.14*/.experience)),format.raw/*114.25*/("""
      </p>
      """)))})),format.raw/*116.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*127.8*/if(user.experience != null)/*127.35*/{_display_(Seq[Any](format.raw/*127.36*/("""
      <p>
        """),_display_(Seq[Any](/*129.10*/user/*129.14*/.projects)),format.raw/*129.23*/("""
      </p>
      """)))})),format.raw/*131.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*142.8*/if(user.experience != null)/*142.35*/{_display_(Seq[Any](format.raw/*142.36*/("""
      <p>
        """),_display_(Seq[Any](/*144.10*/user/*144.14*/.education)),format.raw/*144.24*/("""
      </p>
      """)))})),format.raw/*146.8*/("""
    </div>
  </div>
</div>
""")))})),format.raw/*150.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
<<<<<<< HEAD
                    DATE: Mon May 04 13:38:52 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: af700db6d66841a601e089949cde0ff1bb3b6e30
                    MATRIX: 787->1|914->17|944->39|1011->71|1025->77|1087->118|1128->125|1153->142|1191->143|1228->146|1241->152|1269->159|1415->270|1455->301|1494->302|1588->360|1603->366|1665->405|1696->418|1709->422|1748->423|1856->495|1871->501|1933->540|1980->555|2027->566|2061->591|2100->592|2157->613|2170->617|2201->626|2240->646|2253->650|2292->651|2369->696|2797->1088|2847->1129|2886->1130|3760->1968|3773->1972|3801->1978|4071->2216|4295->2404|4328->2428|4367->2429|4420->2446|4433->2450|4463->2458|4511->2474|4557->2485|4598->2517|4637->2518|4690->2535|4703->2539|4741->2555|4789->2571|4835->2582|4869->2607|4908->2608|4961->2625|4974->2629|5005->2638|5053->2654|5349->2914|5382->2938|5421->2939|5487->2969|5500->2973|5530->2981|5589->3008|5847->3230|5884->3257|5924->3258|5983->3280|5997->3284|6031->3295|6084->3316|6356->3552|6393->3579|6433->3580|6492->3602|6506->3606|6538->3615|6591->3636|6844->3853|6881->3880|6921->3881|6980->3903|6994->3907|7027->3917|7080->3938|7145->3971
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|60->32|60->32|60->32|84->56|84->56|84->56|91->63|101->73|101->73|101->73|102->74|102->74|102->74|103->75|105->77|105->77|105->77|106->78|106->78|106->78|107->79|109->81|109->81|109->81|110->82|110->82|110->82|111->83|123->95|123->95|123->95|125->97|125->97|125->97|127->99|139->111|139->111|139->111|141->113|141->113|141->113|143->115|154->126|154->126|154->126|156->128|156->128|156->128|158->130|169->141|169->141|169->141|171->143|171->143|171->143|173->145|177->149
=======
                    DATE: Mon May 04 17:31:51 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: 787a407eae32ca0cd768e5070c2c04e778bb4157
                    MATRIX: 787->1|913->17|941->36|1007->67|1021->73|1083->114|1122->119|1147->136|1185->137|1221->139|1234->145|1262->152|1402->257|1442->288|1481->289|1574->346|1589->352|1651->391|1681->403|1694->407|1733->408|1840->479|1855->485|1917->524|1963->538|2009->548|2043->573|2082->574|2138->594|2151->598|2182->607|2220->626|2233->630|2272->631|2347->674|2869->1160|2919->1201|2958->1202|3808->2016|3821->2020|3849->2026|4112->2257|4326->2435|4359->2459|4398->2460|4450->2476|4463->2480|4493->2488|4540->2503|4584->2512|4625->2544|4664->2545|4716->2561|4729->2565|4767->2581|4814->2596|4858->2605|4892->2630|4931->2631|4983->2647|4996->2651|5027->2660|5074->2675|5358->2923|5391->2947|5430->2948|5494->2976|5507->2980|5537->2988|5595->3013|5841->3223|5878->3250|5918->3251|5975->3271|5989->3275|6023->3286|6074->3305|6335->3530|6372->3557|6412->3558|6469->3578|6483->3582|6515->3591|6566->3610|6808->3816|6845->3843|6885->3844|6942->3864|6956->3868|6989->3878|7040->3897|7101->3926
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|61->33|61->33|61->33|85->57|85->57|85->57|92->64|102->74|102->74|102->74|103->75|103->75|103->75|104->76|106->78|106->78|106->78|107->79|107->79|107->79|108->80|110->82|110->82|110->82|111->83|111->83|111->83|112->84|124->96|124->96|124->96|126->98|126->98|126->98|128->100|140->112|140->112|140->112|142->114|142->114|142->114|144->116|155->127|155->127|155->127|157->129|157->129|157->129|159->131|170->142|170->142|170->142|172->144|172->144|172->144|174->146|178->150
>>>>>>> 2b258ea4a556f051de588edae1086775e04850b4
=======
                    DATE: Mon May 04 21:40:29 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: ac2ff1f22fbd7bc256ff293e8025de7c1ac3ed92
                    MATRIX: 787->1|913->17|941->36|1007->67|1021->73|1083->114|1122->119|1147->136|1185->137|1221->139|1234->145|1262->152|1402->257|1442->288|1481->289|1574->346|1589->352|1651->391|1681->403|1694->407|1733->408|1840->479|1855->485|1917->524|1963->538|2009->548|2043->573|2082->574|2138->594|2151->598|2182->607|2220->626|2233->630|2272->631|2347->674|2396->687|2411->693|2474->734|2988->1212|3038->1253|3077->1254|3927->2068|3940->2072|3968->2078|4231->2309|4445->2487|4478->2511|4517->2512|4569->2528|4582->2532|4612->2540|4659->2555|4703->2564|4744->2596|4783->2597|4835->2613|4848->2617|4886->2633|4933->2648|4977->2657|5011->2682|5050->2683|5102->2699|5115->2703|5146->2712|5193->2727|5477->2975|5510->2999|5549->3000|5613->3028|5626->3032|5656->3040|5714->3065|5960->3275|5997->3302|6037->3303|6094->3323|6108->3327|6142->3338|6193->3357|6454->3582|6491->3609|6531->3610|6588->3630|6602->3634|6634->3643|6685->3662|6927->3868|6964->3895|7004->3896|7061->3916|7075->3920|7108->3930|7159->3949|7220->3978
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|61->33|61->33|61->33|85->57|85->57|85->57|92->64|102->74|102->74|102->74|103->75|103->75|103->75|104->76|106->78|106->78|106->78|107->79|107->79|107->79|108->80|110->82|110->82|110->82|111->83|111->83|111->83|112->84|124->96|124->96|124->96|126->98|126->98|126->98|128->100|140->112|140->112|140->112|142->114|142->114|142->114|144->116|155->127|155->127|155->127|157->129|157->129|157->129|159->131|170->142|170->142|170->142|172->144|172->144|172->144|174->146|178->150
>>>>>>> b3a22e47a1a7935bbebab4765ffc738bee4e6801
                    -- GENERATED --
                */
            