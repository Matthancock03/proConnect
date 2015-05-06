
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
	<div class="row clearfix">
		<div class="col-xs-2 column">

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
	<div class="row clearfix">
		<div class="col-xs-4 column">
		</div>
		<div class="col-xs-8 column">
			<ul class="pagination">
				<li>
					<a href="#">Prev</a>
				</li>
				<li>
					<a href="#">1</a>
				</li>
				<li>
					<a href="#">2</a>
				</li>
				<li>
					<a href="#">3</a>
				</li>
				<li>
					<a href="#">4</a>
				</li>
				<li>
					<a href="#">5</a>
				</li>
				<li>
					<a href="#">Next</a>
				</li>
			</ul>
		</div>
	</div>
</div>
""")))})),format.raw/*167.2*/("""
"""))}
    }
    
    def render(messages:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(messages)
    
    def f:((List[Message]) => play.api.templates.HtmlFormat.Appendable) = (messages) => apply(messages)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 12:46:29 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/message.scala.html
                    HASH: d9a4058c9c1b7ef8bb490d304da5dc53597ac744
                    MATRIX: 783->1|919->26|949->48|986->51|1011->68|1049->69|1117->102|1131->108|1191->147|1232->154|1245->160|1273->167|1680->538|1695->544|1745->572|1912->703|1927->709|1982->742|2566->1291|2628->1337|2667->1338|2735->1371|2768->1382|2879->1457|2906->1462|2945->1465|2961->1472|2996->1485|3070->1524|3086->1531|3119->1542|3189->1577|3205->1584|3234->1591|3304->1626|3331->1644|3370->1645|3412->1669|3425->1673|3464->1674|3521->1700|3600->1743|3627->1748|3725->1810|3741->1817|3775->1829|4057->2075|4072->2081|4145->2132|4291->2247|4606->2525|4658->2567|4698->2568|5789->3626|6391->4196
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|54->26|54->26|54->26|55->27|55->27|55->27|86->58|86->58|86->58|89->61|89->61|92->64|92->64|92->64|92->64|92->64|95->67|95->67|95->67|98->70|98->70|98->70|101->73|101->73|101->73|103->75|103->75|103->75|105->77|109->81|109->81|111->83|111->83|111->83|114->86|114->86|114->86|118->90|128->100|128->100|128->100|158->130|195->167
                    -- GENERATED --
                */
            