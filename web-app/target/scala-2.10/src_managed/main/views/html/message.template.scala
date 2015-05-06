
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
object message extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ProConect")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*6.32*/routes/*6.38*/.Assets.at("stylesheets/index.min.css"))),format.raw/*6.77*/("""">

"""),_display_(Seq[Any](/*8.2*/navbar/*8.8*/.render)),format.raw/*8.15*/("""
<div class="container">
	<div class="row clearfix">
		<div class="col-xs-12 column">
			<div class="page-header">
				<h1>
					Messages
				</h1>
			</div>
		</div>
	</div>
	
		<div class="col-xs-3 column">

			<div class="btn-group btn-group-vertical btn-group-md">
			<br /><br /><br />
			 <br />
			<div>
				  <a href=""""),_display_(Seq[Any](/*26.17*/routes/*26.23*/.MessageController.message())),format.raw/*26.51*/(""""><button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-left"></em>Inbox</button></a>
					<a href=""""),_display_(Seq[Any](/*27.16*/routes/*27.22*/.MessageController.sentMessages())),format.raw/*27.55*/(""""><button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-left"></em>Sent</button></a>
			</div>
			</div>
		</div>
		<div class="col-xs-6 column">

			<table class="table table-condensed" style="background-color: #FFFFFF;">
				<thead>
					<tr>
						<th>
							#
						</th>
						<th>
							Message
						</th>
						<th>
							From
						</th>
						<th>
							Date
						</th>
						<th>
							Status
						</th>
						<th>

						</th>
					</tr>
				</thead>
				<tbody>

					"""),_display_(Seq[Any](/*58.7*/for((message, index) <- messages.zipWithIndex) yield /*58.53*/{_display_(Seq[Any](format.raw/*58.54*/("""
					<tr>
						<td>
							"""),_display_(Seq[Any](/*61.9*/{index + 1})),format.raw/*61.20*/("""
						</td>
						<td>
							<a data-toggle="collapse" data-target="#"""),_display_(Seq[Any](/*64.49*/index)),format.raw/*64.54*/("""">"""),_display_(Seq[Any](/*64.57*/message/*64.64*/.messageTitle)),format.raw/*64.77*/("""</a>
						</td>
						<td>
							"""),_display_(Seq[Any](/*67.9*/message/*67.16*/.senderName)),format.raw/*67.27*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*70.9*/message/*70.16*/.tstamp)),format.raw/*70.23*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*73.9*/if(message.isRead)/*73.27*/{_display_(Seq[Any](format.raw/*73.28*/("""
								Read
							""")))}/*75.9*/else/*75.13*/{_display_(Seq[Any](format.raw/*75.14*/("""
								Unread
							""")))})),format.raw/*77.9*/("""
						</td>
					</tr>

					<tr id=""""),_display_(Seq[Any](/*81.15*/index)),format.raw/*81.20*/("""" class="collapse">
						<td>#</td>
						<td colspan="4">"""),_display_(Seq[Any](/*83.24*/message/*83.31*/.messageBody)),format.raw/*83.43*/("""</td>
						<td>
							<a href="#" ><button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target=".bs-example-modal-lg"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></button></a>
							<a href=""""),_display_(Seq[Any](/*86.18*/routes/*86.24*/.MessageController.deleteMessage(message.messageId))),format.raw/*86.75*/("""" ><span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span></a>
						</td>
					</tr>

				""")))})),format.raw/*90.6*/("""
				</tbody>
			</table>

			<!-- Large modal -->

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*100.12*/form(routes.UserController.replyMessage())/*100.54*/{_display_(Seq[Any](format.raw/*100.55*/("""

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
            					placeholder="User Id"
            					type="text"
            					name="id"
            					id="id"
            					value=""
                      style="display: none;"
            				/>
          		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%;">Send Message</button>
            </div>
        	</div>
          	""")))})),format.raw/*130.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->

		</div>
	</div>
	
</div>
""")))})),format.raw/*139.2*/("""
"""))}
    }
    
    def render(messages:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(messages)
    
    def f:((List[Message]) => play.api.templates.HtmlFormat.Appendable) = (messages) => apply(messages)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 16:48:52 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/message.scala.html
                    HASH: cd15aaaa293a3c87b619b68e4975c6e7e56deb97
                    MATRIX: 783->1|919->26|949->48|986->51|1011->68|1049->69|1117->102|1131->108|1191->147|1232->154|1245->160|1273->167|1654->512|1669->518|1719->546|1886->677|1901->683|1956->716|2540->1265|2602->1311|2641->1312|2709->1345|2742->1356|2853->1431|2880->1436|2919->1439|2935->1446|2970->1459|3044->1498|3060->1505|3093->1516|3163->1551|3179->1558|3208->1565|3278->1600|3305->1618|3344->1619|3386->1643|3399->1647|3438->1648|3495->1674|3574->1717|3601->1722|3699->1784|3715->1791|3749->1803|4031->2049|4046->2055|4119->2106|4265->2221|4580->2499|4632->2541|4672->2542|5763->3600|5885->3690
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|54->26|54->26|54->26|55->27|55->27|55->27|86->58|86->58|86->58|89->61|89->61|92->64|92->64|92->64|92->64|92->64|95->67|95->67|95->67|98->70|98->70|98->70|101->73|101->73|101->73|103->75|103->75|103->75|105->77|109->81|109->81|111->83|111->83|111->83|114->86|114->86|114->86|118->90|128->100|128->100|128->100|158->130|167->139
                    -- GENERATED --
                */
            