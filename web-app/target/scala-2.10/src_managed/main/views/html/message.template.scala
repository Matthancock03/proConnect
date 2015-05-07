
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

			<div class="btn-group btn-group-md">
			<br /><br /><br />
			 <br />
			<div>
				  <a href=""""),_display_(Seq[Any](/*26.17*/routes/*26.23*/.MessageController.message())),format.raw/*26.51*/(""""><button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-left"></em>Inbox</button></a>
				<div>
					<br />
					<a href=""""),_display_(Seq[Any](/*29.16*/routes/*29.22*/.MessageController.sentMessages())),format.raw/*29.55*/(""""><button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-left"></em>Sent</button></a>
			  </div>
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

					"""),_display_(Seq[Any](/*61.7*/for((message, index) <- messages.zipWithIndex) yield /*61.53*/{_display_(Seq[Any](format.raw/*61.54*/("""
					<tr>
						<td>
							"""),_display_(Seq[Any](/*64.9*/{index + 1})),format.raw/*64.20*/("""
						</td>
						<td>
							<a data-toggle="collapse" data-target="#"""),_display_(Seq[Any](/*67.49*/index)),format.raw/*67.54*/("""">"""),_display_(Seq[Any](/*67.57*/message/*67.64*/.messageTitle)),format.raw/*67.77*/("""</a>
						</td>
						<td>
							"""),_display_(Seq[Any](/*70.9*/message/*70.16*/.senderName)),format.raw/*70.27*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*73.9*/message/*73.16*/.tstamp)),format.raw/*73.23*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*76.9*/if(message.isRead)/*76.27*/{_display_(Seq[Any](format.raw/*76.28*/("""
								Read
							""")))}/*78.9*/else/*78.13*/{_display_(Seq[Any](format.raw/*78.14*/("""
								Unread
							""")))})),format.raw/*80.9*/("""
						</td>
					</tr>

					<tr id=""""),_display_(Seq[Any](/*84.15*/index)),format.raw/*84.20*/("""" class="collapse">
						<td>#</td>
						<td colspan="4">"""),_display_(Seq[Any](/*86.24*/message/*86.31*/.messageBody)),format.raw/*86.43*/("""</td>
						<td>
							<a href="#" ><button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target=".bs-example-modal-lg"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></button></a>
							<a href=""""),_display_(Seq[Any](/*89.18*/routes/*89.24*/.MessageController.deleteMessage(message.messageId))),format.raw/*89.75*/("""" ><span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span></a>
						</td>
					</tr>

				""")))})),format.raw/*93.6*/("""
				</tbody>
			</table>

			<!-- Large modal -->

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*103.12*/form(routes.UserController.replyMessage())/*103.54*/{_display_(Seq[Any](format.raw/*103.55*/("""

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
          	""")))})),format.raw/*133.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->

		</div>
	</div>

</div>
""")))})),format.raw/*142.2*/("""
"""))}
    }
    
    def render(messages:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(messages)
    
    def f:((List[Message]) => play.api.templates.HtmlFormat.Appendable) = (messages) => apply(messages)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 07 00:26:11 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/message.scala.html
                    HASH: 7e02ee98c0aa4e78b8f59bc17290605fd63444fa
                    MATRIX: 783->1|918->26|946->45|982->47|1007->64|1045->65|1112->97|1126->103|1186->142|1225->147|1238->153|1266->160|1609->467|1624->473|1674->501|1862->653|1877->659|1932->692|2497->1222|2559->1268|2598->1269|2663->1299|2696->1310|2804->1382|2831->1387|2870->1390|2886->1397|2921->1410|2992->1446|3008->1453|3041->1464|3108->1496|3124->1503|3153->1510|3220->1542|3247->1560|3286->1561|3326->1583|3339->1587|3378->1588|3433->1612|3508->1651|3535->1656|3631->1716|3647->1723|3681->1735|3960->1978|3975->1984|4048->2035|4190->2146|4495->2414|4547->2456|4587->2457|5648->3485|5760->3565
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|54->26|54->26|54->26|57->29|57->29|57->29|89->61|89->61|89->61|92->64|92->64|95->67|95->67|95->67|95->67|95->67|98->70|98->70|98->70|101->73|101->73|101->73|104->76|104->76|104->76|106->78|106->78|106->78|108->80|112->84|112->84|114->86|114->86|114->86|117->89|117->89|117->89|121->93|131->103|131->103|131->103|161->133|170->142
                    -- GENERATED --
                */
            