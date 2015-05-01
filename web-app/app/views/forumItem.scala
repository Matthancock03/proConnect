@(forumItems: List[forumItem], user:author)
main("ProConnect") {
@navbar.render()

<div class="feed-div">
			@for(forumItem <- forumItems){
				@if(feedItem.publish_date != ""){
					<a href="@feedItem.url" target="_blank" style="text-decoration: none;">
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
							<img alt="" class="feed-image feed-head" src="@routes.Assets.at("images/tech.png")" />
							<h3 class="panel-title head-text feed-head">@forumItem.title</h3>
						</div>
						<br>
						<p style="padding-top: 10px;">@forumItem.article</p>
						<p class="foot-text">@forumItem.publish_date  @forumItem.source</p>	
					</div>
				</div>
				</a>
				}
			}

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<form role="form">
				<div class="form-group">
					 <label for="exampleInputComment">Comment Section</label><input class="form-control" id="exampleInputEmail1" type="email" />
				</div>
			
				</div> <button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</div>
</div>


		</div>


}