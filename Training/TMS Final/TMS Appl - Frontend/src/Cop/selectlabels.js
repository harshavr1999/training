import * as React from 'react';

import InputLabel from '@mui/material/InputLabel';

import MenuItem from '@mui/material/MenuItem';

import FormHelperText from '@mui/material/FormHelperText';

import Select from '@mui/material/Select';

import FormControl from '@mui/material/FormControl';
import { Grid } from '@mui/material';


export default function SelectLabels(props) {


  return (
    <Grid item xs={12} sm={6}>
    <div className='select'>

      <FormControl sx={{ m: 0, width:370}}>

        <InputLabel id="demo-simple-select-helper-label">{props.label}</InputLabel>

        <Select 

          labelId="demo-simple-select-helper-label"

          id="demo-simple-select-helper"

          value={props.value}

          label={props.label}

          onChange={props.onChange}

          //autoWidth

          className='dropdown'

          disabled={props.disabled}

          
        >

          <MenuItem value="">

            <em>None</em>

          </MenuItem>

          {props.lists.map( (list) =>

            <MenuItem value={list.offecneId} key={list.offecneId}>

              {list.offenceType}

            </MenuItem>

          )}

        </Select>

        <FormHelperText className='helpertext'>Select Your Choice</FormHelperText>

      </FormControl>

    </div>
     </Grid>
  );

}