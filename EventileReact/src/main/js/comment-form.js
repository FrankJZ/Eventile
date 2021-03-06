/**
 * Created by FrankJiao on 2017-03-23.
 */
import React from 'react';
import ReactDOM from 'react-dom';
import 'whatwg-fetch';


class CommentForm extends React.Component {
    constructor(props) {
        super(props);
    }

    render () {
        return (

            <form className="form-horizontal" name="commentForm" onSubmit={this.props.onSubmit} ref="commentForm">
                <div className="form-group">
                    <label htmlFor="comment" className="col-sm-4-control-label">Write Your Comment:</label>
                    <div className="col-sm-10">
                        <input type="text"
                               className="form-control" id="comment"
                               placeholder="Comment"
                               ref="comment"
                        />
                    </div>
                </div>

                <div className="form-group">
                    <div className="post-comment">
                        <button type="submit" className="btn btn-default">{this.props.submitLabel}</button>
                    </div>
                </div>
            </form>
        )
    }

    data() {
        let comment = ReactDOM.findDOMNode(this.refs.comment).value.trim();
        let comment_box = ReactDOM.findDOMNode(this.refs.comment);
        comment_box.value = "";

        return {
            comment: comment
        }
    }

}

export default CommentForm;
