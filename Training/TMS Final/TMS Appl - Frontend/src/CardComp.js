import * as React from 'react';
import Card from '@mui/material/Card';
import Avatar from '@mui/material/Avatar';
import { CardActionArea, CardContent, Typography } from '@mui/material';


  
export default class CardComp extends React.Component {
       render() {
        return (
          <Card sx={{ maxWidth: 345, boxShadow:7 }}>
            <CardActionArea href={this.props.hrf}> 
            <CardContent>
        <Avatar 
        alt="Remy Sharp"
        src={this.props.image}
        sx={{width: 200, height: 200, paddingLeft: 7 }}
      /></CardContent>
             
         <CardContent>
        <Typography gutterBottom variant="h5" component="div">
          {this.props.cardName}
        </Typography>
        <Typography variant="body2" color="text.secondary">
          {this.props.details}
        </Typography>
      </CardContent>
      </CardActionArea>
          </Card>
        );
      }
    }
      



